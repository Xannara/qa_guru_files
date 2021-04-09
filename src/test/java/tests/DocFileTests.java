package tests;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static utils.Files.readTextFromDocxPath;
import static utils.Files.readTextFromPath;

public class DocFileTests {

    @Test
    void docTest() throws IOException {
        String docFilePath = "./src/test/resources/files/2.doc";
        String expectedData = "Диаграмма Гантта (График работ)";

        String actualData = readTextFromDocxPath(docFilePath);
        assertThat(actualData, containsString(expectedData));
    }

    @Test
    void docxTest() throws IOException {
        String docxFilePath = "./src/test/resources/files/1.docx";
        String expectedData = "Диаграмма Гантта (График работ)";

        String actualData = readTextFromDocxPath(docxFilePath);
        assertThat(actualData, containsString(expectedData));
    }
}
