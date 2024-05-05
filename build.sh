#! /bin/bash

rm -rf ./build
mkdir ./build
mkdir ./build/classes
#mkdir ./build/resources

#cp -r ./src/main/resources ./build/

cpath=./build/classes:\
./src/main/java/sira4j

javac -cp $cpath -d ./build/classes ./src/main/java/sira4j/Main.java
