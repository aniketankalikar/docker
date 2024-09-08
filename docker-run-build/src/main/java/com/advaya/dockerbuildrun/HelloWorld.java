package com.advaya.dockerbuildrun;

public class HelloWorld {

    public static void main(String [] args)
    {
        if(args.length>0)
        {
            System.out.println("Arguments Passed "+args[0]);
        }
        else {
            System.out.println("No Arguments Passed");
        }
    }
}
