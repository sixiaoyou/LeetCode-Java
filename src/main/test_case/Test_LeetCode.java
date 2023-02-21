import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import sourcecode_2023.february.LeetCode2037_MinimumNumberOfMovesToSeatEveryone;
import sourcecode_2023.february.LeetCode2520_CountTheDigitsThatDivideANumber;

/*
Note:
Test source_code/SourceCode_2023/February/LeetCode2520_CountTheDigitsThatDivideANumber
 */


public class Test_LeetCode extends LeetCode2037_MinimumNumberOfMovesToSeatEveryone {
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
        int[] a = {12, 14, 19, 19, 12};
        int[] b = {19, 2, 17, 20, 7};

        Assert.assertEquals(minMovesToSeat(a, b), 19);
    }
}
