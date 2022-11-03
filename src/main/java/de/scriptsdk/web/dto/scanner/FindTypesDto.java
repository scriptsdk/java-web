package de.scriptsdk.web.dto.scanner;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class FindTypesDto {
    private List<Integer> types = new ArrayList<>();
    private List<Integer> colors = new ArrayList<>();
    private List<Long> containers = new ArrayList<>();
    private Boolean scanRecursive = false;
}
