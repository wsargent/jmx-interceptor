import com.sun.jmx.interceptor.MBeanServerInterceptor;

import javax.management.*;
import javax.management.loading.ClassLoaderRepository;
import java.io.ObjectInputStream;

/**
 * A MBeanServerInterceptor interface that provides default methods that throw UnsupportedOperationException.
 */
public interface MyMBeanServerInterceptor extends MBeanServerInterceptor {

    default Object instantiate(String className) throws ReflectionException, MBeanException {
        throw new UnsupportedOperationException();
    }

    default Object instantiate(String className, ObjectName loaderName) throws ReflectionException, MBeanException, InstanceNotFoundException {
        throw new UnsupportedOperationException();
    }

    default Object instantiate(String className, Object[] params, String[] signature) throws ReflectionException, MBeanException {
        throw new UnsupportedOperationException();
    }

    default Object instantiate(String className, ObjectName loaderName, Object[] params, String[] signature) throws ReflectionException, MBeanException, InstanceNotFoundException {
        throw new UnsupportedOperationException();
    }

    default ObjectInputStream deserialize(ObjectName name, byte[] data) throws InstanceNotFoundException, OperationsException {
        throw new UnsupportedOperationException();
    }

    default ObjectInputStream deserialize(String className, byte[] data) throws OperationsException, ReflectionException {
        throw new UnsupportedOperationException();
    }

    default ObjectInputStream deserialize(String className, ObjectName loaderName, byte[] data) throws InstanceNotFoundException, OperationsException, ReflectionException {
        throw new UnsupportedOperationException();
    }

    default ClassLoaderRepository getClassLoaderRepository() {
        throw new UnsupportedOperationException();
    }
}
