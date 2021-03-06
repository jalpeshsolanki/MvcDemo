package in.mvcdemo.Utills;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ImageValidator {

    private static final String IMAGE_PATTERN =
            "([^\\s]+(\\.(?i)(jpg|png|gif|bmp))$)";
    private static Pattern pattern;
    private static Matcher matcher;

    public ImageValidator() {
        pattern = Pattern.compile(IMAGE_PATTERN);
    }

    /**
     * Validate image with regular expression
     *
     * @param image image for validation
     * @return true valid image, false invalid image
     */
    public static boolean validate(final String image) {

        matcher = pattern.matcher(image);
        return matcher.matches();

    }
}