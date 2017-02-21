package jjcctest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * @author zyl
 * 所有用例一起运行
 */


@RunWith(Suite.class)
@Suite.SuiteClasses({
	Calculator.class,
	SquareTest.class
})
public class AllTestResult {

}
