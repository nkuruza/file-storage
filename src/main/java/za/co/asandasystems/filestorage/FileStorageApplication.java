package za.co.asandasystems.filestorage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import za.co.asandasystems.filestorage.conf.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class FileStorageApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileStorageApplication.class, args);
	}

}
