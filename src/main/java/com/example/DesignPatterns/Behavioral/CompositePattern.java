package com.example.DesignPatterns.Behavioral;

import java.util.ArrayList;
import java.util.List;

// Calculator and FileSystems can be classic examples of composite pattern

public class CompositePattern {

    public static void main(String[] args) {
        FileSystem fileSystem = new File("Dominos File");
        FileSystem fileSystem1 = new File("MTR File");
        FileSystem fileSystem2 = new File("Burger King File");

        FileSystem fileSystem3 = new File("Google Company");
        FileSystem fileSystem4 = new File("Microsoft Company");
        FileSystem fileSystem5 = new File("Apple Company");
        FileSystem fileSystem6 = new File("Amazon Company");
        FileSystem fileSystem7 = new File("Netflix Company");
        FileSystem fileSystem8 = new File("Facebook Company");

        FileSystem fileSystem9 = new File("Selena Gomez");
        FileSystem fileSystem10 = new File("Taylor Swift");
        FileSystem fileSystem11 = new File("Ellie Goulding");

        FileSystem fileSystem101 = new Directory("Food Chains");
        fileSystem101.addFileSystem(fileSystem);
        fileSystem101.addFileSystem(fileSystem1);
        fileSystem101.addFileSystem(fileSystem2);

        FileSystem fileSystem102 = new Directory("Famous IT Companies");
        fileSystem102.addFileSystem(fileSystem3);
        fileSystem102.addFileSystem(fileSystem4);
        fileSystem102.addFileSystem(fileSystem5);
        fileSystem102.addFileSystem(fileSystem6);
        fileSystem102.addFileSystem(fileSystem7);
        fileSystem102.addFileSystem(fileSystem8);

        FileSystem fileSystem103 = new Directory("Basic Stuff");
        fileSystem103.addFileSystem(fileSystem9);
        fileSystem103.addFileSystem(fileSystem10);
        fileSystem103.addFileSystem(fileSystem11);
        fileSystem103.addFileSystem(fileSystem101);
        fileSystem103.addFileSystem(fileSystem102);


        fileSystem103.ls();
    }



}

interface FileSystem {
    void addFileSystem(FileSystem fileSystem);

    void ls();
}

class File implements FileSystem {

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void addFileSystem(FileSystem fileSystem) {}

    @Override
    public void ls() {
        System.out.println("File Name : " + fileName);
    }
}

class Directory implements FileSystem {

    String directoryName;
    List<FileSystem> fileSystems;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        fileSystems = new ArrayList<>();
    }

    @Override
    public void addFileSystem(FileSystem fileSystem) {
        fileSystems.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("----------------------------------------------------");
        System.out.println("Directory Name : " + directoryName);
        System.out.println("----------------------------------------------------");
        fileSystems.forEach(FileSystem::ls);
    }
}