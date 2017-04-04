/**
 * Created by viliev on 4.4.2017 г..
 * Да се намерят всички стандартни изключения от йерархията на java.lang.RuntimeException.
 */
public class AllStandardExceptionsFromRuntimeException {

    public class AnnotationTypeMismatchException {
        /*    extends RuntimeException
        Thrown to indicate that a program has attempted to access an element of an annotation whose type has changed after the annotation was compiled (or serialized).
        This exception can be thrown by the API used to read annotations reflectively.
        */
    }

    public class ArithmeticException {
        /*  extends RuntimeException
        Thrown when an exceptional arithmetic condition has occurred.
        For example, an integer "divide by zero" throws an instance of this class.
        ArithmeticException objects may be constructed by the virtual machine as if suppression were disabled and/or the stack trace was not writable.
        */
    }

    public class ArrayStoreException {
        /*  extends RuntimeException
        Thrown to indicate that an attempt has been made to store the wrong type of object into an array of objects.
        For example, the following code generates an ArrayStoreException:
        Object x[] = new String[3];
        x[0] = new Integer(0);
        */
    }

    public class BufferOverflowException {
        /* extends RuntimeException
        Unchecked exception thrown when a relative put operation reaches the target buffer's limit.
        */
    }

    public class BufferUnderflowException {
        /* extends RuntimeException
        Unchecked exception thrown when a relative get operation reaches the source buffer's limit.
        */
    }

    public class CannotRedoException {
        /*  extends RuntimeException
        Thrown when an UndoableEdit is told to redo() and can't.
        */
    }

    public class CannotUndoException {
        /* extends RuntimeException
        Thrown when an UndoableEdit is told to undo() and can't.
         */
    }

    public class ClassCastException {
        /*             extends RuntimeException
        Thrown to indicate that the code has attempted to cast an object to a subclass of which it is not an instance.
        For example, the following code generates a ClassCastException:
        Object x = new Integer(0);
        System.out.println((String)x);
        */
    }

    public class CMMException {
        /*   extends RuntimeException
        This exception is thrown if the native CMM returns an error.
        */
    }

    public class ConcurrentModificationException {
        /*   extends RuntimeException
    This exception may be thrown by methods that have detected concurrent modification of an object when such modification is not permissible.
    For example, it is not generally permissible for one thread to modify a Collection while another thread is iterating over it. In general, the results of the iteration are undefined under these circumstances. Some Iterator implementations (including those of all the general purpose collection implementations provided by the JRE) may choose to throw this exception if this behavior is detected. Iterators that do this are known as fail-fast iterators, as they fail quickly and cleanly, rather that risking arbitrary, non-deterministic behavior at an undetermined time in the future.
    Note that this exception does not always indicate that an object has been concurrently modified by a different thread. If a single thread issues a sequence of method invocations that violates the contract of an object, the object may throw this exception. For example, if a thread modifies a collection directly while it is iterating over the collection with a fail-fast iterator, the iterator will throw this exception.
    Note that fail-fast behavior cannot be guaranteed as it is, generally speaking, impossible to make any hard guarantees in the presence of unsynchronized concurrent modification. Fail-fast operations throw ConcurrentModificationException on a best-effort basis. Therefore, it would be wrong to write a program that depended on this exception for its correctness: ConcurrentModificationException should be used only to detect bugs.
       */
    }


    public class DataBindingException {
        /* extends RuntimeException
        Exception that represents a failure in a JAXB operation.
        This exception differs from JAXBException in that this is an unchecked exception, while JAXBException is a checked exception.
        */
    }

    public class DOMException {
        /*   extends RuntimeException
        DOM operations only raise exceptions in "exceptional" circumstances, i.e., when an operation is impossible to perform (either for logical reasons, because data is lost, or because the implementation has become unstable). In general, DOM methods return specific error values in ordinary processing situations, such as out-of-bound errors when using NodeList.
        Implementations should raise other exceptions under other circumstances. For example, implementations should raise an implementation-dependent exception if a null argument is passed when null was not expected.
        Some languages and object systems do not support the concept of exceptions. For such systems, error conditions may be indicated using native error reporting mechanisms. For some bindings, for example, methods may return error codes similar to those listed in the corresponding method descriptions.
        */
    }

    public class EmptyStackException {
        /*   extends RuntimeException
        Thrown by methods in the Stack class to indicate that the stack is empty.
        */
    }

    public class EnumConstantNotPresentException {
        /*   extends RuntimeException
        Thrown when an application tries to access an enum constant by name and the enum type contains no constant with the specified name.
        This exception can be thrown by the API used to read annotations reflectively.
         */
    }


    public class EventException {
        /*    extends RuntimeException
        Event operations may throw an EventException as specified in their method descriptions.
        */
    }

    public class FileSystemAlreadyExistsException {
        /*    extends RuntimeException
        Runtime exception thrown when an attempt is made to create a file system that already exists.
        */
    }

    public class FileSystemNotFoundException {
        /*    extends RuntimeException
        Runtime exception thrown when a file system cannot be found.
         */
    }

    public class IllegalArgumentException {
        /*    extends RuntimeException
        Thrown to indicate that a method has been passed an illegal or inappropriate argument.
        */
    }

    public class IllegalMonitorStateException {
        /*    extends RuntimeException
        Thrown to indicate that a thread has attempted to wait on an object's monitor or to notify other threads waiting on an object's monitor without owning the specified monitor.
         */
    }


    public class IllegalPathStateException {
        /*  extends RuntimeException
        The IllegalPathStateException represents an exception that is thrown if an operation is performed on a path that is in an illegal state with respect to the particular operation being performed,
        such as appending a path segment to a GeneralPath without an initial moveto.
         */
    }


    public class IllegalStateException {
        /*   extends RuntimeException
        Signals that a method has been invoked at an illegal or inappropriate time.
        In other words, the Java environment or Java application is not in an appropriate state for the requested operation.
        */
    }

    public class IllformedLocaleException {
        /*  extends RuntimeException
        Thrown by methods in Locale and Locale.Builder to indicate that an argument is not a well-formed BCP 47 tag.
         */
    }

    public class ImagingOpException {
        /*  extends RuntimeException
        The ImagingOpException is thrown if one of the BufferedImageOp or RasterOp filter methods cannot process the image.
        */
    }

    public class IncompleteAnnotationException {
        /*  extends RuntimeException
        Thrown to indicate that a program has attempted to access an element of an annotation type that was added to the annotation type definition after the annotation was compiled (or serialized).
        This exception will not be thrown if the new element has a default value. This exception can be thrown by the API used to read annotations reflectively.
         */
    }

    public class IndexOutOfBoundsException {
        /*  extends RuntimeException
        Thrown to indicate that an index of some sort (such as to an array, to a string, or to a vector) is out of range.
        Applications can subclass this class to indicate similar exceptions.
         */
    }

    public class JMRuntimeException {
        /* extends RuntimeException
        Runtime exceptions emitted by JMX implementations.
         */
    }

    public class LSException {
        /*  extends RuntimeException
        Parser or write operations may throw an LSException if the processing is stopped.
        The processing can be stopped due to a DOMError with a severity of DOMError.SEVERITY_FATAL_ERROR or a non recovered DOMError.SEVERITY_ERROR,
         or if DOMErrorHandler.handleError() returned false.
         */
    }

    public class MalformedParameterizedTypeException {
        /*  extends RuntimeException
        Thrown when a semantically malformed parameterized type is encountered by a reflective method that needs to instantiate it.
        For example, if the number of type arguments to a parameterized type is wrong.
         */
    }

    public class MirroredTypesException {
        /*  extends RuntimeException
        Thrown when an application attempts to access a sequence of Class objects each corresponding to a TypeMirror.
        */
    }

    public class MissingResourceException {
        /*  extends RuntimeException
        Signals that a resource is missing.
         */

    }

    public class NegativeArraySizeException {
        /*  extends RuntimeException
        Thrown if an application tries to create an array with negative size.
        */
    }


    public class NoSuchElementException {
        /*             extends RuntimeException
        Thrown by the nextElement method of an Enumeration to indicate that there are no more elements in the enumeration.
        */
    }

    public class NoSuchMechanismException {
        /*             extends RuntimeException
        This exception is thrown when a particular XML mechanism is requested but is not available in the environment.
        A NoSuchMechanismException can contain a cause: another throwable that caused this NoSuchMechanismException to get thrown.
        */
    }

    public class NullPointerException {
        /*     extends RuntimeException
    Thrown when an application attempts to use null in a case where an object is required. These include:
    Calling the instance method of a null object.
    Accessing or modifying the field of a null object.
    Taking the length of null as if it were an array.
    Accessing or modifying the slots of null as if it were an array.
    Throwing null as if it were a Throwable value.
    Applications should throw instances of this class to indicate other illegal uses of the null object.
    NullPointerException objects may be constructed by the virtual machine as if suppression were disabled and/or the stack trace was not writable.
       */
    }

    public class ProfileDataException {
        /*   extends RuntimeException
        This exception is thrown when an error occurs in accessing or processing an ICC_Profile object.
        */
    }

    public class ProviderException {
        /*  extends RuntimeException
        A runtime exception for Provider exceptions (such as misconfiguration errors or unrecoverable internal errors),
        which may be subclassed by Providers to throw specialized, provider-specific runtime errors.
         */
    }

    public class ProviderNotFoundException {
        /*  extends RuntimeException
        Runtime exception thrown when a provider of the required type cannot be found.

         */
    }

    public class RasterFormatException {
        /* extends RuntimeException
        The RasterFormatException is thrown if there is invalid layout information in the Raster.
        */
    }

    public class RejectedExecutionException {
        /* extends RuntimeException
        Exception thrown by an Executor when a task cannot be accepted for execution.
        */
    }

    public class SecurityException {
        /* extends RuntimeException
        Thrown by the security manager to indicate a security violation.
        */
    }

    public abstract class SystemException {
        /* extends RuntimeException
        The root class for all CORBA standard exceptions. These exceptions may be thrown as a result of any CORBA operation invocation
        and may also be returned by many standard CORBA API methods. The standard exceptions contain a minor code, allowing more detailed specification, and a completion status.
        This class is subclassed to generate each one of the set of standard ORB exceptions. SystemException extends java.lang.RuntimeException;
        thus none of the SystemException exceptions need to be declared in signatures of the Java methods mapped from operations in IDL interfaces.
         */
    }

    public class TypeConstraintException {
        /* extends RuntimeException
        This exception indicates that a violation of a dynamically checked type constraint was detected.
        This exception can be thrown by the generated setter methods of the schema derived Java content classes.
        However, since fail-fast validation is an optional feature for JAXB Providers to support, not all setter methods will throw this exception when a type constraint is violated.
        If this exception is throw while invoking a fail-fast setter, the value of the property is guaranteed to remain unchanged, as if the setter were never called.
         */
    }

    public class TypeNotPresentException {
        /* extends RuntimeException
        Thrown when an application tries to access a type using a string representing the type's name, but no definition for the type with the specified name can be found.
        This exception differs from ClassNotFoundException in that ClassNotFoundException is a checked exception, whereas this exception is unchecked.
        Note that this exception may be used when undefined type variables are accessed as well as when types (e.g., classes, interfaces or annotation types) are loaded.
        In particular, this exception can be thrown by the API used to read annotations reflectively.
        */
    }

    public class UndeclaredThrowableException {
        /*  extends RuntimeException
        Thrown by a method invocation on a proxy instance if its invocation handler's invoke method throws a checked exception
        (a Throwable that is not assignable to RuntimeException or Error) that is not assignable to any of the exception types declared
        in the throws clause of the method that was invoked on the proxy instance and dispatched to the invocation handler.
        An UndeclaredThrowableException instance contains the undeclared checked exception that was thrown by the invocation handler,
        and it can be retrieved with the getUndeclaredThrowable() method. UndeclaredThrowableException extends RuntimeException, so it is an unchecked exception that wraps a checked exception.
        As of release 1.4, this exception has been retrofitted to conform to the general purpose exception-chaining mechanism.
        The "undeclared checked exception that was thrown by the invocation handler" that may be provided at construction time
        and accessed via the getUndeclaredThrowable() method is now known as the cause, and may be accessed via the Throwable.getCause() method, as well as the aforementioned "legacy method."
         */
    }


    public class UnknownEntityException {
        /*  extends RuntimeException
        Superclass of exceptions which indicate that an unknown kind of entity was encountered.
        This situation can occur if the language evolves and new kinds of constructs are introduced.
        Subclasses of this exception may be thrown by visitors to indicate that the visitor was created for a prior version of the language.
        A common superclass for those exceptions allows a single catch block to have code handling them uniformly.
        */
    }

    public class UnmodifiableSetException {
        /*  extends RuntimeException
        Thrown to indicate that the requested operation cannot be performed because the set is unmodifiable.
         */
    }

    public class UnsupportedOperationException {
        /* extends RuntimeException
        Thrown to indicate that the requested operation is not supported.
        This class is a member of the Java Collections Framework.
         */
    }

    public class WebServiceException {
        /* extends RuntimeException
        The WebServiceException class is the base exception class for all JAX-WS API runtime exceptions.
         */
    }

    public class WrongMethodTypeException {
        /* extends RuntimeException
        Thrown to indicate that code has attempted to call a method handle via the wrong method type.
        As with the bytecode representation of normal Java method calls, method handle calls are strongly typed to a specific type descriptor associated with a call site.
        This exception may also be thrown when two method handles are composed, and the system detects that their types cannot be matched up correctly.
        This amounts to an early evaluation of the type mismatch, at method handle construction time, instead of when the mismatched method handle is called.
         */
    }
}
