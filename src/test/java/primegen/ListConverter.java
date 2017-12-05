package primegen;

import com.github.approval.converters.AbstractStringConverter;
import com.github.approval.converters.Converter;

import java.nio.charset.StandardCharsets;
import java.util.List;

public class ListConverter<T> extends AbstractStringConverter<List<T>> {
    private final Converter<T> typeConverter;

    public ListConverter(Converter<T> typeConverter) {
        this.typeConverter = typeConverter;
    }

    protected String getStringForm(List<T> values) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < values.size(); i++) {
            builder.append("[")
                    .append(i).append("] = ")
                    .append(new String(this.typeConverter.getRawForm(values.get(i)), StandardCharsets.UTF_8))
                    .append(System.lineSeparator());
        }

        return builder.toString();
    }
}
