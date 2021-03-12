package leetcode.editor.cn

import spock.lang.Shared
import spock.lang.Specification

class P1TwoSumSpec extends Specification {

    @Shared
    P1TwoSum p1TwoSum = new P1TwoSum();
    @Shared
    P1TwoSum.Solution solution = new P1TwoSum.Solution(p1TwoSum)

    def "int array: #arrs ,target: #target ,twoSum: #expect"() {
        given: "init solution object"
        expect: "use with to verify actual and expect,fails on the first failed assertions,use verifyAll to soft assert"
        with(solution) {
            twoSum(arrs, target) == expect
        }
        where: "data-driven test,All failures will be reported"
        arrs                    | target || expect
        [2, 7, 11, 15] as int[] | 9      || [0, 1] as int[]
        [3, 2, 4] as int[]      | 6      || [1, 2] as int[]
        [3, 3] as int[]         | 6      || [0, 1] as int[]
        [] as int[]             | 0      || [0] as int[]
        [1] as int[]            | 1      || [0] as int[]
    }
}
