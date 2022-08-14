class Solution:
    def interpret(self, command: str) -> str:
        s=""
        for i in range(len(command)):
            if command[i] == "G" :
                s=s+command[i]
            elif command[i] == "(" and command[i+1] == ")":
                s=s+"o"
            elif command[i] =="(" and command[i+3]== ")" :
                s=s+"al"
        return s