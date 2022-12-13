package designPattern.behavioral.strategyPattern.encryptor.solution1;

public class File {
    String fileName;

    public File(String fileName){
        this.fileName = fileName;
    }

    public void encrypt(Encryptor encryptor){
        System.out.println(encryptor.encrypt(fileName));
    }

}
