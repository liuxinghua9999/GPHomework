package com.gupaoedu.homework.pattern.prototype.deep;

import java.io.*;

/**
 * @author 刘兴华
 * @Description: ${todo}
 * @date 2019/4/29 16:55
 */
public class Client {

    public Prototype cloneStart(Prototype prototype) {
        return prototype.clone();
    }

    public Prototype deepCloneStart(Prototype prototype) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(prototype);

            ByteArrayInputStream inputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            return (Prototype) objectInputStream.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return prototype.clone();
    }

}
