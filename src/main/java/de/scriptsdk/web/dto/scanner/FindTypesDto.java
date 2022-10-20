package de.scriptsdk.web.dto.scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindTypesDto {
    private List<Integer> types;
    private List<Integer> colors;
    private List<Long> containers;
    private Boolean scanRecursive;
}
