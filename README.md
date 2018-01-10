# Android-AOP
优雅Android AOP架构设计

使用AspectJ做AOP可以做一些非侵入的AOP监控操作，方便简洁，功能强大，而且对目标工程没有侵入性，可以做切面的操作：监听方法耗时、输出日志、控制初入参数、进行运行时修改等等操作。 在Eclipse中已经有AJDT插件集成了AspectJ编译器的使用和关键字的声明。但是在Android Studio中没有这样的官方插件。因此，本项目主要解决如何在Android Studio中使用AspectJ。详细了解AspectJ的使用请看[Android基于AOP的非侵入式监控](http://blog.csdn.net/woshimalingyi/article/details/51476559#reply)

AspectJ的使用核心就是它的编译器，它就做了一件事，将AspectJ的代码在编译期插入目标程序当中，运行时跟在其它地方没什么两样，因此要使用它最关键的就是使用它的编译器去编译代码ajc。ajc会构建目标程序与AspectJ代码的联系，在编译期将AspectJ代码插入被切出的PointCut中，以达到AOP的目的。 
因此，无论在什么IDE上（如果使用命令行就可以直接使用ajc编译了），问题就是让IDE使用ajc作为编译器编译代码。

本项目的gradle配置参考的文章：[Aspect Oriented Programming in Android](https://fernandocejas.com/2014/08/03/aspect-oriented-programming-in-android/)
