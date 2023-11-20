#%% 실수의 오류
print(0.1+0.2)
print(0.1+0.2==0.3) #False

print("%f" %0.3)    #소수점 6자리까지만 정확
#%% 실수의 오류 해결1
import math

print(math.isclose(0.1+0.2,0.3))
#%% 실수의 오류 해결2
from decimal import Decimal

print(float(Decimal('0.1')+Decimal('0.2')))