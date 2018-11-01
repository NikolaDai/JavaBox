#JAVABOX 
早就听说JAVA 8中的Lambda表达式，但总是感觉工作中并不是必需品之一，因此未曾花点时间看看。近来，看一本Spring MVC的书，作者开篇又在强调这么一句话：“如果你不采用Lambda来简化代码，真是一件遗憾的事情！”正好刚完成一个项目，所以想静下心看看到底Lambda能否帮我简化项目中的若干代码。如果认为看官方文档更靠谱，请移步https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html。谈及Lambda表达式，对匿名类要有些使用体会，从而对
Lambda表达式带来的便利会有更深刻的体验。在你的代码中用过匿名类吗？了解匿名类吗？有的话，请移步Section 2。

##Section 1 匿名类
匿名类用于简化代码，当仅需要使用一次某个父类或者接口时，推荐使用匿名类。示例如下：
``````
    public static void sortIgnoreCase(String[] strs){
        Arrays.sort(strs, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2){
                return o1.compareToIgnoreCase(o2);
            }
        });
    }
```````
当在IDEA编辑器输入上述代码时，会有下列提示：
Anonymous new Comparator<String>() can be replaced with lambda
Inspection info: This inspection reports all anonymous classes which can be replaced with lambda expressions
Lambda syntax is not supported under Java 1.7 or earlier JVMs。

##Section 2 lambda表达式
