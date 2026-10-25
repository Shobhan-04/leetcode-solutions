class Solution:
    def numUniqueEmails(self, emails: list[str]) -> int:
        '''
            Time complexity = O(n * m), 
            Space complexity = O(n)
        '''

        n = len(emails)
        valid_email_set = set()

        for i in range(n) : # O(n)
            email = emails[i]
            m = len(email)

            valid_email = ""
            is_plus, is_at_the_rate = False, False

            for j in range(m) : # O(m)
                email_ch = email[j]

                if(email_ch == '@') :
                    is_at_the_rate = True
                    valid_email += email_ch
                    continue
            
                if(is_at_the_rate == True) :
                    valid_email += email_ch
                    continue
                

                if(email_ch == '+') :
                    is_plus = True
                    continue
                
                if(is_plus == True) :
                    continue

                if(email_ch >= 'a' and email_ch <= 'z') :
                    valid_email += email_ch
                
                if(email_ch == '.') :
                    continue
                
            valid_email_set.add(valid_email)
        
        return(len(valid_email_set))