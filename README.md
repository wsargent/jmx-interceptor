# virtual mbeans JMX Interceptor

This is the "virtual mbeans" code example from OpenDMK.  It displays the filesystem as a "virtual mbean" so that you can browse it from the jconsole without actually creating any mbeans.

The Oracle documentation from the Java Dynamic Management Kit 5.1 Tutorial is here:

http://docs.oracle.com/cd/E19698-01/816-7609/6mdjrf85d/index.html

Note that this project does NOT rely on any DMK code or libraries, but can be run right out of the box.

The original example used `MBeanServerInterceptor`, but for JDK 1.5 only the MBeanServer interface is required -- the `MBeanServerInterceptor` interface is basically there to tell you which methods can throw UnsupportedOperationExceptions.

The original DMK examples are lost to history.  They are not available on the Oracl website, and I pulled the code from https://github.com/javaee/hk2-extra/tree/master/experiments/jmx

This code has been modified to work with JDK 1.8 with a default methods `MBeanServerInterceptor` and use `MBeanServer` as the base interface.