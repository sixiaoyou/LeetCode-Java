import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sourcecode_2023.february.LeetCode2520_CountTheDigitsThatDivideANumber;

/*
Note:
Test source_code/SourceCode_2023/February/LeetCode2520_CountTheDigitsThatDivideANumber
 */


public class Test_LeetCode extends LeetCode2520_CountTheDigitsThatDivideANumber {
    /**
     * @BelongsProject: LeetCode-Java
     * @BelongsPackage: TestCase
     * @CreateTime: 2023/2/20 8:55
     * @Author: Sixiaoyou
     * @Version: 1.0
     */

    /**
     * @BeforeClass 方法 为类初始化方法
     * 属于模块公共方法，用于编写模块公共初始化代码
     * 除特殊情况外，一定要标注 alwaysRun = true
     */

    @BeforeClass(alwaysRun = true)
    public void class_setup() {

        System.out.println("Initialize test...");
    }

    /**
     * @AfterClass 方法 为类清除方法
     * 属于模块公共方法，用于编写模块公共清理代码
     * 除特殊情况外，一定要标注 alwaysRun = true
     */
    @AfterClass(alwaysRun = true)
    public void class_teardown() {
        System.out.println("Clear test...");
    }


    @Test(description = "assertEqualsTest")
    public void assertEqualsTest() {
        int num = 121;
        Assert.assertEquals(countDigitsV1(num), 2);
        Assert.assertEquals(countDigitsV2(num), 2);
    }
}
