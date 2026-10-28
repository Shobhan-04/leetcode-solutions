class Solution:
    def fairCandySwap(self, aliceSizes: list[int], bobSizes: list[int]) -> list[int]:
        '''
            delta calculation logic :-
                sumAliceBoxes - x + y = sumBobBoxes - y + x
                => delta = y = (subBobBoxes - sumAliceBoxes + 2x) / 2

            Time complexity = O(n + 2m) = O(n + m), 
            Space complexity = O(n) -> Auxilliary space for bob_set.
        '''

        m, n = len(aliceSizes), len(bobSizes)
        sum_alice_boxes, sum_bob_boxes = 0, 0
        alice_exchanged_candies_count, bob_exchanges_candies_count = 0, 0

        bob_set = set()

        result = [0] * 2

        for i in range(n) :
            bobElems = bobSizes[i]
            sum_bob_boxes += bobElems
            bob_set.add(bobElems)
        
        for j in range(m) :
            aliceElems = aliceSizes[j]
            sum_alice_boxes += aliceElems

        delta = (sum_bob_boxes - sum_alice_boxes) // 2
        
        for i in range(m) :
            aliceElems = aliceSizes[i]
            bobs_reqd_boxes = (aliceElems + delta)
        
            if(bobs_reqd_boxes in bob_set) :
                alice_exchanged_candies_count = aliceElems
                bob_exchanged_candies_count = bobs_reqd_boxes
            
                result[0] = alice_exchanged_candies_count
                result[1] = bob_exchanged_candies_count
            
        
        return result