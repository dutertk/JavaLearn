# Vim文本编辑器
### Vim工作模式  
![image][temp]   

### 插入命令  

命令|作用 
-|-
a|在光标后添加文本
A|在本行行末添加文本
i|在光标前添加文本
I|在本行行首添加文本
o|在光标下插入新行
O|在光标上插入新行

### 定位命令  

命令|作用
-|-
:set nu|显示行号
:set nonu|取消显示行号
gg|到第一行
G|到最后一行
ng|到第n行
:n|到第n行

### 保存和退出命令
命令|作用
-|-
:w|保存修改
:wq|保存修改并退出
:q!|不保存直接退出
:w &nbsp; new filename|另存为

### 删除命令

命令|作用
-|-
x|删除光标所在处的字符
nx|删除光标所在处后n个字符
dd|删除光标所在的行
ndd|删除n行
:n1,n2d|删除指定的行
dG|删除光标所在行到末尾的内容
D|删除光标所在行到行尾的内容

### 搜索和替换命令

命令|作用
-|-
/string|向后搜索指定字符串
?string|向前搜索指定字符串
n|搜索字符串出现的下一个位置，与搜索顺序相同
N|搜索字符串出现的上一个位置，与搜索顺序相反
:%s/old/new/g|全文替换指定字符串
:n1,n2s/old/new/g|在指定范围内替换指定字符串


[temp]:data:image/jpeg;base64,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832oV3Hscvmouiy0F1kowRKJn0pp7AGswm04826yST5JPQyq27JswjOt9aCaArSSt9La1ZadCuHEq8CYBBLOypRkhJhBE7TUjoJNwGYnL6psHYlkj6fFWlliEiLS2AgwJq666VFhsB5xA6SiJbFZLS+BvnNMCaZQ4ZboqTcDn/TjUEC2IqC3VF6HGgSxAhudqki4xNHOac6RxDnN6naalJEtFl5bUJGbO569PNusitQWjPWZ+qiQxATNop20GU4Gt6iSCFiJihhW1L83UyRZ4tPKJlui+ajMdxj6A0wIpMSodWl1uAZvyYtUY983IE1o9Oy/yIQOnWRBE/EM9jJ7lSTZAwmVs+T2CrYGV2Kg0gMO5V93yGQ7reWU9fKaB7TiR+B+pAlQ0v8ApgocJnrHkwQIECBAgQIECBAgQIECBArGG6es+RXJGhX/AIXkkCBAgQIECBAgQIECBAgQKZcoP6LQAABYD9Q7QsGyCL20r//aAAwDAQACAAMAAAAQ888w80w48w488888888888888888888888888888848UwIo8A88888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888888w8w448w8888888888888888w88888888888888s8csc8s8888888888888888M0888888888888s8888888888c8888888c88888888k888888888888ssE888888888888888888AsW88888888888888s8cc8884i+++++++4/88s8ff8APPPPPPPPPPPPPPPPPPPPN/ffNO/OffffPPPPPPPPPPPPPPPPPPPPPPPPPPF/f80BnN/fffPPPPPPPPPPPPPPPPPPPPPPPPPPF/fffffffetvPPPPPPPPPPPPPPPPPPPPPNPPPOPPKPPPPONLMPPPPPPPPPPPPPPPPPPPPLnHfPOLPOHPPPPPCNLEPPPNPMOetMNOPPPPPPPPPPPPNPOGPONPPPPCNLEPPILGMC2GYJ/PPPPPPPPPMFPOHKGBP/PPPNCNLEPPPPPPPPPPPPPPPPPPPKLPOHPPPPPPPPPPPCNLEPPPPPPPPPPPPPOOscYUccUcdtPPPPPPPNscVcYVccdNvPPPPPPPOffe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