#! /bin/bash
echo "Cleaning build directory..."
rm -rf ./build
mkdir ./build
mkdir ./build/classes
#mkdir ./build/resources

echo "compiling library sources..."
srcs=`find ./src/main/java -not -type d -not -name Main.*`
echo $srcs
javac -d ./build/classes $srcs

echo "packaging library..."
bins=`find ./build/classes -not -type d`
jar cf ./dist/sira.jar -C ./build/classes sira4j/Sira.class $bins

echo "building sample project..."
javac -cp ./dist/sira.jar -d ./build/classes ./src/main/java/Main.java

