#基础知识
###一、基本数据类型（8种）
|数据类型|类型说明|内存大小|
---|---|---|
char|字符|2字节
byte|字节型|1字节
short|短整型|4字节
int|整型|4字节
long|长整型|8字节
float|单精度浮点型|4字节
double|双精度浮点型|8字节
boolean|布尔型|1位

数据类型应用举例   
其中第一项称为**变量类型**，第二项称为**变量名**，注：**分号**是必须的，这是java语句的结束标志。
```

int a = 20;
long b = 0x22L;//十六进制的
char c = "b";
boolean flag = true;
```
常量是从程序开始到结束都不会发生改变的量，在java中用关键字**“final”**来声明一个常量
```
final int CONSTANT = 8012;
```
java中的数据类型转换优先关系如下   
**byte,short,char** -> **int** -> **long** -> **float** -> **double** 由低到高可以自动转换   
强制转换则要在需要转换的数据前加（），然后在括号内加上需要转化的数据类型
```
int floatDemo = (float)5.23f;
```

###二、数组
数组的声明有两种形式：   
```
int[] a;
int a[];
```
其中 **int** 是指数组存放的数据类型，**a**则是数组的名称。
数组的初始化
```
静态初始化
String stringArray[] = {"abc", "cd", "def"}

int intArray = {1,2,3,4}

动态初始化

int[] intArray = new int[4];



```
**注：**   
1. 数组是对象类型，声明时要使用 **new**关键字。   
2. 数组一旦被声明就不能改变容量，可以用数组的下标来获取数组中的值。
###三、JDK和JRE以及JVM
1. JDK：Java Developper Kit,开发者工具套装，包含完整的JRE和JAVA运行环境。
2. JRE：Java Runtime Environment，运行java程序的，针对普通用户。
3. JVM：将字节码即.class文件转换成特定机器代码，提供内存管理和垃圾回收（GC）和安全机制等。独立于硬件和操作系统，因此说java语言具有跨平台性。
