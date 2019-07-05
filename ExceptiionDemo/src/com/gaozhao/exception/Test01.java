package com.gaozhao.exception;

import java.io.FileNotFoundException;

/*
	RuntimeException（运行时异常）这些异常是不检查异常，程序中可以选择捕获处理，也可以不处理，如果不处理，异常直接交给jvm返回异常信息
此类异常一般是jvm抛出，很多时候都会发生，不好预估，所以不强制用户处理）
	非运行时异常 （编译异常）：是RuntimeException以外的异常，类型上都属于Exception类及其子类。从程序语法角度讲是必须进行处理的异常，如果不处理，程序就不能编译通过。如IOException、SQLException等以及用户自定义的Exception异常
非运行时异常(容易检查的异常,好处是必须让用户处理，防止程序中断)
	如果异常不进行捕获，那么程序运行期间出现异常会导致程序终止
	一旦某个catch捕获到匹配的异常类型，将进入异常处理代码。一经处理结束，就意味着整个try-catch语句结束。其他的catch子句不再有匹配和捕获异常类型的机会。
	
	try 块：用于捕获异常。其后可接零个或多个catch块，如果没有catch块，则必须跟一个finally块。
	catch 块：用于处理try捕获到的异常。
	finally 块：无论是否捕获或处理异常，finally块里的语句都会被执行。当在try块或catch块中遇到return语句时，finally语句块将在方法返回之前被执行。在以下4种特殊情况下，finally块不会被执行：
	1）在finally语句块中发生了异常。
	2）在前面的代码中用了System.exit()退出程序。
	3）程序所在的线程死亡。
	4）关闭CPU。
*/
/*
 * 【重点】：当try中出现异常时，try块中的其它语句不再执行，直接执行相对应的catch块，
 * 当在try块或catch块中遇到return语句时，finally语句块将在方法返回之前被执行（返回值先保存下来，不会受到finally语句影响），如果finally语句块中有return,则返回值为finally中的return。
 * finally的作用就是总是被执行，（不管try catch中是否有返回语句或抛出新异常）
 */
public class Test01 {

	public static void main(String [] args) throws Exception{
		System.out.println(aa());
	}
	
	public static int aa() {
		int i = 5;
		try {
			System.out.println("111111111");
			int a = 1 / 0;
			System.out.println("222222222");
			return 1;
		}catch(Exception e) {
			System.out.println("333333333");
			return i;
		}finally {
			System.out.println("444444444");
			i++;
			return 3;
		}
	}
}
