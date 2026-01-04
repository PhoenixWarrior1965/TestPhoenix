import random, time
import pandas as pd
from sklearn.linear_model import LinearRegression

start = time.time()
with open('data.csv','w') as f:
    f.write('Miles,Cost\n')
    for _ in range(1000):
        x = random.randint(1,100)
        f.write(f'{x},{10+5*x}\n')
print(f"Elapsed time: {time.time() - start:.4f} seconds")


# Load the generated data
df = pd.read_csv('data.csv')

# Prepare features and target
X = df[['Miles']]
y = df['Cost']

# Use 30% of the data to train
train_size = int(0.3 * len(df))
X_train = X[:train_size]
y_train = y[:train_size]
model = LinearRegression()
model.fit(X_train, y_train)

# Ask user for input and predict cost
miles = float(input("Enter miles: "))
predicted_cost = model.predict([[miles]])[0]
print(f"Predicted cost for {miles} miles: {predicted_cost:.2f}")

# Example prediction
miles = 50
predicted_cost = model.predict([[miles]])[0]
print(f"Predicted cost for {miles} miles: {predicted_cost:.2f}")