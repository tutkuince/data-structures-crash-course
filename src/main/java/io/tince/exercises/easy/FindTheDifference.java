package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Find the Difference
 *
 * You are given two strings "s" and "t".
 *
 * String "t" is generated by random shuffling string "s" and then add one more letter at a random position.
 * Return the letter that was added to "t"
 *
 * Example 1:
 *  - Input: s = "abcd", t = "abcde"
 *  - Output: "e"
 *  - Explanation: 'e' is the letter that was added.
 *
 * Example 2:
 *  - Input: s = "", t = "y"
 *  - Output: "y"
 *
 *  Constraints:
 *   - 0 <= s.length <= 1000
 *   - t.length == s.length + 1
 *   - "s" and "t" consist of lowercase English letters.
 * */
public class FindTheDifference {
    public static void main(String[] args) {
        System.out.println(new FindTheDifference().findTheDifference("ihwrdisrhgxwbfevrxbtzgsywhnzleueadikniwyuasflpsviobwvsmydmyzppqjlmzakpbnouyttdigkcdzypvcqxbttmblttehgjlnpjwpzoprntifysfatjboasottnkpyyvmdcafpjicfpgmbwqdsaxdmmdmupnwhkpxixpdwmczntqtushemvavofszomtsrafzmxctpidjadwcwggdbyliqmcvuwscryfsvlvfrhfphmxvcnytbctomicwdwjjmdhmcqtnlqgixxdyjydhwnftkobotbhsgykawhtvnkxoykwkgvtqioqoiilergxlpuujabiug", "gyptmtjntxlusjhbzkbgowslthwtytdnflsyfsgfytzrodatykdyvgsmvxsuemijitvodmwrrqmcabhwzyoouorfckhisjpduoxvtmttzvwmicdxsovsabmpcpppzycuwbmpihmxadmvkkwerimhgwdwdtvqwbwtetppkpkbcaifuqbenagycdqatklciaczcpglxmvfaqnwpnssdmnhcmifeyndzttvypwlgpttvhswoiijybchbvzklgngqziyaczowgwiufqyhxxdqjrxolddgnmriijopdsikqwtyhplhubrljfjanexxyfvjmudxsomnfbafntpib"));
    }

    public char findTheDifference(String s, String t) {
        int num = 0;

        for(int cs : s.toCharArray()) num -= cs;

        for(int ct : t.toCharArray()) num += ct;

        return (char) (num);
    }
}
