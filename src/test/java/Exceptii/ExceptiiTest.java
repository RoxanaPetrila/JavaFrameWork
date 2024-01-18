package Exceptii;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ExceptiiTest {

    @Test
    public void checkedExceptionType(){
        ExceptionConcepts exceptionConcepts = new ExceptionConcepts();
        exceptionConcepts.checkedExample("src/test/java/Exceptii/document.txt");
        exceptionConcepts.checkedExample("src/test/ja/Exceptii/document.txt");
    }
    @Test
    public void uncheckedExceptionType(){
        ExceptionConcepts exceptionConcepts = new ExceptionConcepts();
        exceptionConcepts.uncheckedExampleV1();
    }

    @Test
    public void uncheckedExceptionType2(){
        ExceptionConcepts exceptionConcepts = new ExceptionConcepts();
        exceptionConcepts.uncheckedExampleV2();
    }
    @Test
    public void throwException(){
        ExceptionConcepts exceptionConcepts = new ExceptionConcepts();
        exceptionConcepts.verificaVarsta(20);
        exceptionConcepts.verificaVarsta(15);
    }

    @Test
    public void throwsException() throws FileNotFoundException {
        ExceptionConcepts exceptionConcepts = new ExceptionConcepts();
        exceptionConcepts.throwsExample("");
    }
}
