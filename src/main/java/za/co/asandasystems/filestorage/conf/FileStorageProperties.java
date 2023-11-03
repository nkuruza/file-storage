package za.co.asandasystems.filestorage.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@ConfigurationProperties(prefix = "files")
public class FileStorageProperties {
	private String location;
}
