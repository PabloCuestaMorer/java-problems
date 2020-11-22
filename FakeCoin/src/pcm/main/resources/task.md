
# 💰 Fake Coin
Given a two pan fair balance and N identically looking coins, out of which only one coin
is lighter (or heavier). To figure out the odd coin, how many minimum number of weighing 
are required in the worst case?

Given 5 coins out of which one coin is heavier. In the worst case, how many minimum number
of weighing are required to figure out the odd coin?
 
Name the coins as 1, 2, 3, 4 and 5. We know that one coin is lighter. Considering best 
out come of balance, we can group the coins in two different ways, [(1, 2), (3, 4) and (5)],
or [(12), (34) and (5)]. We can easily rule out groups like [(123) and (45)], as we will get
an obvious answer. Any other combination will fall into one of these two groups, like 
[(2)(45) and (13)], etc.
 
Consider the first group, pairs (1, 2) and (3, 4). We can check (1, 2), if they are equal we 
go ahead with (3, 4). We need two weighing in worst case. The same analogy can be applied when 
the coin in heavier.
 
With the second group, weigh (12) and (34). If they balance (5) is defective one, otherwise 
pick the lighter pair, and we need one more weighing to find odd one.
 
Both the combinations need two weighing in case of 5 coins with prior information of one coin 
is lighter.
 
Analysis: In general, if we know that the coin is heavy or light, we can trace the coin in 
log3(N) trials (rounded to next integer). If we represent the outcome of balance as ternary 
tree, every leaf represent an outcome. Since any coin among N coins can be defective, we need 
to get a 3-ary tree having minimum of N leaves. A 3-ary tree at k-th level will have 3k leaves 
and hence we need 3k >= N.
 
In other-words, in k trials we can examine upto 3k coins, if we know whether the defective 
coin is heavier or lighter. Given that a coin is heavier, verify that 3 trials are sufficient 
to find the odd coin among 12 coins, because 32 < 12 < 33.