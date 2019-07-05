package com.gaozhao.exception;

public class MyExceptionTest {

    public static void main(String[] args) {
        //抛出的运行时异常如果不进行捕获，讲直接交给JVM处理，程序不再往下执行
    	test();
    }
    
    public static void test() throws MyException{
    	String[] sexs = {"男性","女性","中性"};
        for(int i = 0; i < sexs.length; i++){
            if("中性".equals(sexs[i])){
                throw new MyException("你全家都是中性！");
            }else{
                System.out.println(sexs[i]);
            }
        } 
        
    }
}