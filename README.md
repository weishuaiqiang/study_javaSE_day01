# study_javaSE_day01
# 1.自动类型转换和强制类型转换
AutoTypeConversion.java                               <br/>
自动类型转换                                           <br/>
小容量转大容量  boolean 不在里面 容量是指数的取值范围     <br/>
byte 转 short        <br/>
byte 转 int          <br/>
short 转 int         <br/>
char 转 int          <br/>

强制类型转换          <br/>
大容量转小容量        <br/>
大容量类型进行截断 截断成和小容量类型一样的取值范围      <br/>
会出现精度损失                                       <br/>
需要使用强制类型转换符  ()                             <br/>
int 转 byte                                          <br/>
// 2.转换后为负数                                     <br/>
int i1 = 128;                                         
byte b1 = (byte)i1;
System.out.println(b1); // 结果为-128
<!-- // 因为转换之后 b1 的二进制位是 1000 0000 这种数比较特殊
// 表示负的最小值 -128 -->

# 2.
