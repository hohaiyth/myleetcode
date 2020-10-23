class Solution:
    def judgeCircle(self, moves: str) -> bool:
        x = y = 0
        for move in moves:
            if move == 'U':y+=1
            if move == 'D':y-=1
            if move == 'L':x-=1
            if move == 'R':x+=1

        return x == y ==0



class Solution:
    def judgeCircle(self, moves: str) -> bool:
        return moves.count('U')==moves.count('D') and moves.count('L')==moves.count('R')
