# 多线程
### 一、概念
说起多线程，肯定要提到进程。进程就是一个独立执行的程序，比如word，excel等。  
线程：一个进程里面可以包含多个线程。一个线程就是一个程序内部的一条执行线索。   
单线程中，代码是按照顺序依次执行的，主函数调用了子函数，必须等待子函数返回后才能继续往下执行，不能两端代码同时交替运行。这就需要多线程。   
创建多线程的方式有两种：  
**1. 继承Thread类**   
**2. 实现Runnable接口**
### 二、用Thread类创建线程  

```  

public class ThreadDemo   
{  
public static void main(String[] args)   
{
        new ThreadTest().start();   
        while(true)   
        {  
            System.out.println("MainThread is running");   
        }     
           
    }

}
class ThreadTest extends Thread   
{   
    public void run()   
    {   
        while (true)  
        {   
        System.out.println(Thread.currentThread().getName() +" is running!");  
        }  
    }  
}  

``` 

多线程小结：   

- 要将一段代码在在一个新的线程上运行，需要将这段代码放在某个类的run()方法中，并且这个类是Thread的子类。  
-  启动一个新的线程不是直接调用子类对象的run()方法，而是调用从Thread类继承来的子类对象的start()方法。 
-  由于线程的代码段在run 方法中，那么该方法执行完成以后线程也就相应的结束了，因而我们可以通过控制run方法中的循环条件来控制线程的终止。

### 三、使用Runnable接口实现多线程
使用Thread(Runnable target)方
法创建线程对象时，需为该方法传递一个实现了Runnable 接口的类对象，这样创建的线程将调用
那个实现了Runnable 接口的类对象中的run()方法作为其运行代码，而不再调用Thread类中的run
方法了。

```   

public class ThreadDemo3
    
{  
public static void main(String args[])  
{    

t.start();//使线程进入Runnable状态  
while(true)  
{  
   System.out.println("main thread is running");
}  
}   
}  
class TestThread implements Runnable   
{  
public void run()//线程的代码段，当执行start()时，线程从此出开始执行   
{  
while(true)   
{      
System.out.println(Thread.currentThread().getName() +
" is running");   
}     
}   
}   
```

使用Runnable接口实现多线程的好处：   
1. 适合多个相同程序代码的线程去处理同一资源的情况（售票的例子）  
2. 避免java的单继承特性带来的局限性   
3. 代码能被多个线程共享，与数据是独立的。