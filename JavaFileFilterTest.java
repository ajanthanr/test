import java.io.FileFilter;

public class JavaFileFilterTest {
        public static void main(String[] args) {
                // old java
                JavaFileFilter fileFilter = new JavaFileFilter();
                File dir = new File("/Users/ajanthanr/Development/Java8/LambdaExamples/");
                File [] javaFiles = dir.listFiles(fileFilter);
                
                for (File f : javaFiles) {
                        System.out.println(f);
                }

                // Anonymous class
                FileFilter aFileFilter = new FileFilter() {
                        @Override
                        public boolean accept(File file) {
                                return file.getName().endsWith(".java");
                        }
                };
                
                File aDir = new File("/Users/ajanthanr/Development/Java8/LambdaExamples/");
                File [] aJavaFiles = aDir.listFiles(aFileFilter);

                // Lambda
                FileFilter filter = (File file) -> file.getName().endsWith(".java");
        }
}
