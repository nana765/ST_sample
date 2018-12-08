'''
AND,NAND,ORの論理回路をpythonで実装する
環境：python3
'''

def AND(x1,x2):
    w1,w2,theta = 0.5,0.5,0.7
    tmp = x1*w1+x2*w2
    if tmp <= theta:
        return 0
    elif tmp > theta:
        return 1

def NAND(x1,x2):
    w1,w2,theta = -0.5,-0.5,-0.70
    tmp = x1*w1+x2*w2
    if tmp <= theta:
        return 0
    elif tmp > theta:
        return 1

def OR(x1,x2):
    w1,w2,theta = 0.5,0.5,0.4
    tmp = x1*w1+x2*w2
    if tmp <= theta:
        return 0
    elif tmp > theta:
        return 1

'''
AND,NAND,ORの論理回路をpythonで実装する
重みとバイアスを加える

'''
import numpy as np

def AND(x1,x2):
    x = np.array([x1,x2]) #入力
    w = np.array([0.5,0.5]) #重み
    b = -0.7 #バイアス
    tmp = np.sum(w*x)+b #np.sum(w*x) = 0.5 / np.sum(w*x)+b = -0.9999999999999996 ≒ -0.2
    if tmp <= 0:
        return 0
    else:
        return 1

def NAND(x1,x2):
    x = np.array([x1,x2]) #入力
    w = np.array([-0.5,-0.5]) #重み
    b = 0.7 #バイアス
    tmp = np.sum(w*x)+b
    if tmp <= 0:
        return 0
    else:
        return 1

def OR(x1,x2):
    x = np.array([x1,x2]) #入力
    w = np.array([0.5,0.5]) #重み
    b = -0.2 #バイアス
    tmp = np.sum(w*x)+b
    if tmp <= 0:
        return 0
    else:
        return 1

```
XORゲートを実装する
```

def XOR(x1,x2):
    s1 = NAND(x1,x2)
    s2 = OR(x1,x2)
    y = AND(s1,s2)
    return y
    
