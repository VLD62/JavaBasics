import java.io.IOException;
/**
 * Created by viliev on 24.3.2017 г..
 * Да се намерят всички стандартни изключения от йерархията на java.io.IOException.
 */
public class AllStandardExceptionsFromIOExceptions {

    public class ChangedCharSetException {
       /*  extends IOException
        ChangedCharSetException as the name indicates is an exception thrown when the charset is changed. */
    }

    public class CharacterCodingException {
        /*  extends IOException
        Checked exception thrown when a character encoding or decoding error occurs. */
    }

    public class CharConversionException {
        /*  extends IOException
        Base class for character conversion exceptions.*/
    }

    public class ClosedChannelException {
         /*    extends IOException
        Checked exception thrown when an attempt is made to invoke or complete an I/O operation upon channel that is closed,
        or at least closed to that operation. That this exception is thrown does not necessarily imply that the channel is completely closed.
        A socket channel whose write half has been shut down, for example, may still be open for reading. */
    }

    public class EOFException {
        /*    extends IOException
        Signals that an end of file or end of stream has been reached unexpectedly during input.
        This exception is mainly used by data input streams to signal end of stream.
        Note that many other input operations return a special value on end of stream rather than throwing an exception. */
    }

    public class FileLockInterruptionException {
        /*    extends IOException
        Checked exception received by a thread when another thread interrupts it while it is waiting to acquire a file lock.
        Before this exception is thrown the interrupt status of the previously-blocked thread will have been set.
        */
    }

    public class FileNotFoundException {
        /*    extends IOException
        Signals that an attempt to open the file denoted by a specified pathname has failed.
        This exception will be thrown by the FileInputStream, FileOutputStream, and RandomAccessFile constructors when a file with the specified pathname does not exist.
        It will also be thrown by these constructors if the file does exist but for some reason is inaccessible, for example when an attempt is made to open a read-only file for writing.
        */
    }

    public class FilerException {
        /*   extends IOException
        Indicates a Filer detected an attempt to open a file that would violate the guarantees provided by the Filer.
        Those guarantees include not creating the same file more than once, not creating multiple files corresponding to the same type, and not creating files for types with invalid names.
        */
    }

    public class FileSystemException {
        /*  extends IOException
        Thrown when a file system operation fails on one or two files. This class is the general class for file system exceptions.
        */
    }


    public class HttpRetryException {
        /*  extends IOException
        Thrown to indicate that a HTTP request needs to be retried but cannot be retried automatically, due to streaming mode being enabled.
        */
    }

    public class IIOException {
        /*  extends IOException
        An exception class used for signaling run-time failure of reading and writing operations.
        In addition to a message string, a reference to another Throwable (Error or Exception) is maintained.
        This reference, if non-null, refers to the event that caused this exception to occur. For example, an IOException while reading from a File would be stored there.
         */
    }

    public class InterruptedByTimeoutException {
        /*  extends IOException
        Checked exception received by a thread when a timeout elapses before an asynchronous operation completes.
        */
    }


    public class InterruptedIOException {
        /*
        extends IOException
        Signals that an I/O operation has been interrupted. An InterruptedIOException is thrown to indicate that an input or output transfer has been terminated
        because the thread performing it was interrupted. The field bytesTransferred indicates how many bytes were successfully transferred before the interruption occurred.
        */
    }

    public class InvalidPropertiesFormatException {
        /*  extends IOException
         Thrown to indicate that an operation could not complete because the input did not conform to the appropriate XML document type for a collection of properties,
         as per the Properties specification. Note, that although InvalidPropertiesFormatException inherits Serializable interface from Exception,
         it is not intended to be Serializable. Appropriate serialization methods are implemented to throw NotSerializableException.
         */
    }

    public class JMXProviderException {
        /*  extends IOException
         Exception thrown by JMXConnectorFactory and JMXConnectorServerFactory when a provider exists for the required protocol but cannot be used for some reason.
        */
    }

    public class JMXServerErrorException {
        /* extends IOException
        Exception thrown as the result of a remote MBeanServer method invocation when an Error is thrown while processing the invocation in the remote MBean server.
        A JMXServerErrorException instance contains the original Error that occurred as its cause.
        */
    }

    public class MalformedURLException {
        /*  extends IOException
        Thrown to indicate that a malformed URL has occurred. Either no legal protocol could be found in a specification string or the string could not be parsed.
        */
    }

    public abstract class ObjectStreamException {
        /*   extends IOException
        Superclass of all exceptions specific to Object Stream classes.
        */
    }

    public class ProtocolException {
        /*  extends IOException
        Thrown to indicate that there is an error in the underlying protocol, such as a TCP error.
        */
    }

    public class RemoteException {
        /*  extends IOException
        A RemoteException is the common superclass for a number of communication-related exceptions that may occur during the execution of a remote method call. Each method of a remote interface, an interface that extends java.rmi.Remote, must list RemoteException in its throws clause.
        As of release 1.4, this exception has been retrofitted to conform to the general purpose exception-chaining mechanism. The "wrapped remote exception" that may be provided at construction time and accessed via the public detail field is now known as the cause,
        and may be accessed via the Throwable.getCause() method, as well as the aforementioned "legacy field."
        Invoking the method Throwable.initCause(Throwable) on an instance of RemoteException always throws IllegalStateException.
        */
    }

    public class SaslException {
        /* extends IOException
        This class represents an error that has occurred when using SASL. */
    }

    public class SocketException {
        /* extends IOException
        Thrown to indicate that there is an error creating or accessing a Socket.
        */
    }

    public class SSLException {
        /* extends IOException
        Indicates some kind of error detected by an SSL subsystem. This class is the general class of exceptions produced by failed SSL-related operations.
        */
    }

    public class SyncFailedException {
        /*     extends IOException
        Signals that a sync operation has failed.
        */
    }

    public class UnknownHostException {
        /* extends IOException
        Thrown to indicate that the IP address of a host could not be determined.
        */
    }

    public class UnknownServiceException {
        /* extends IOException
        Thrown to indicate that an unknown service exception has occurred. Either the MIME type returned by a URL connection does not make sense,
        or the application is attempting to write to a read-only URL connection.
        */
    }

    public class UnsupportedDataTypeException {
        /* extends IOException
        Signals that the requested operation does not support the requested data type.
        */
    }

    public class UnsupportedEncodingException {
        /*  extends IOException
        The Character Encoding is not supported.
        */
    }

    public class UserPrincipalNotFoundException {
       /*  extends IOException
        Checked exception thrown when a lookup of UserPrincipal fails because the principal does not exist.
        */
    }

    public class UTFDataFormatException {
        /*    extends IOException
        Signals that a malformed string in modified UTF-8 format has been read in a data input stream or by any class that implements the data input interface.
        See the DataInput class description for the format in which modified UTF-8 strings are read and written.
        */
    }

    public class ZipException {
        /*   extends IOException
        Signals that a Zip exception of some sort has occurred.
        */
    }

}
