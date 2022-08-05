package org.openjdk.samples.jdk8_lambda_samples;

import java.util.stream.Collectors; 
import java.util.stream.*;
import java.nio.file.*;
import java.nio.*;
import java.io.*;
import java.util.IntSummaryStatistics;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String...arg)throws IOException
    {
        System.out.println( "Hello World!" );
        System.out.println("\n----->Average line length:");
        System.out.println("\n----->Average line length:");
        System.out.println(
        		Files.lines(Paths.get("C:\\SpringSTS\\CoreJavaStudy\\jdk8-lambda-samples\\src\\main\\java\\org\\openjdk\\samples\\jdk8_lambda_samples\\App.java"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.averagingInt(String::length))
                );
        
        IntSummaryStatistics stats = Files.lines(Paths.get("C:\\SpringSTS\\CoreJavaStudy\\jdk8-lambda-samples\\src\\main\\java\\org\\openjdk\\samples\\jdk8_lambda_samples\\App.java"))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.summarizingInt(String::length));
        System.out.println(stats.getAverage());
        System.out.println("count=" + stats.getCount());
        System.out.println("max=" + stats.getMax());
        System.out.println("min=" + stats.getMin());
    }
}
