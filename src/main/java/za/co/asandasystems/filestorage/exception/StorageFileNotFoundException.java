package za.co.asandasystems.filestorage.exception;

public class StorageFileNotFoundException extends StorageException {
	private static final long serialVersionUID = -3449383790244097149L;

	public StorageFileNotFoundException(String message) {
		super(message);
	}

	public StorageFileNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
}
