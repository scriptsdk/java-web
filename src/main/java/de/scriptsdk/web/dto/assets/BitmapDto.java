package de.scriptsdk.web.dto.assets;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BitmapDto {
    private List<Byte> bytes;

    public BitmapDto(byte[] bytes) {
        this.bytes = new ArrayList<>();
        for (byte curByte : bytes) {
            this.bytes.add(curByte);
        }
    }
}
