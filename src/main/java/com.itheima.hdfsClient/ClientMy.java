package com.itheima.hdfsClient;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.net.URI;

public class ClientMy {
    public static void main(String[] args) throws Exception{
       /* FileSystem fileSystem =FileSystem.get(new URI("hdfs://node0:8020"),new Configuration(),"root");
        fileSystem.create(new Path("/cmm/wmm"),true);
        fileSystem.copyFromLocalFile(new Path("D:\\java1.txt"),new Path("/cmm"));
        fileSystem.copyToLocalFile(new Path("/cmm/java1.txt"),new Path("E:\\java.txt"));
        fileSystem.close();*/
        System.out.println("hi jds");
    }
}
