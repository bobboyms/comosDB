package br.com.comosdb.teste;

import com.microsoft.azure.spring.data.cosmosdb.core.mapping.Document;
import com.microsoft.azure.spring.data.cosmosdb.core.mapping.PartitionKey;
import lombok.*;
import org.springframework.data.annotation.Id;

@Document(collection = "mycollection")
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class User {
    @Id
    private String id;
    private String firstName;
    @PartitionKey
    private String lastName;
    private String address;

    @Override
    public String toString() {
        return String.format("%s %s, %s", firstName, lastName, address);
    }
}
