
### Intro

* inspired by [this question](https://stackoverflow.com/questions/45166757) on Stack Overflow
* these example illustrate loading a resource in 3 contexts:
    * `classpath` : a client using a plain-old jar on the classpath (succeeds)
    * `modulepath_export` : a client using a modular jar where the resource package is opened ([view here](https://github.com/codetojoy/easter_eggs_for_java_9/blob/master/egg_31_stack_overflow_45166757/modulepath_export/src/net.codetojoy.example/module-info.java)). This succeeds because of the export.
    * `modulepath_no_export` : a client using a modular jar where the resource package is not opened ([view here](https://github.com/codetojoy/easter_eggs_for_java_9/blob/master/egg_31_stack_overflow_45166757/modulepath_no_export/src/net.codetojoy.example/module-info.java)). The load attempt fails, because strong encapsulation protects the resource.

### To Run

* execute: `build_run.sh` in the appropriate directory

### Photo Credit

* _Beethoven house (1821-1823) at the Rathausgasse 10, Baden bei Wien. Here he wrote the Missa Solemnis and completed the 9th symphony "Ode to Joy"_, [link](https://en.wikipedia.org/wiki/Ode_to_Joy#/media/File:Baden.Beethoven01.jpg) by Georges Jansoone, via [CC BY 2.5](https://creativecommons.org/licenses/by/2.5/)
