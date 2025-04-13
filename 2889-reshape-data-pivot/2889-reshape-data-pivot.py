import pandas as pd

def pivotTable(df):
    return df.pivot(index='month', columns='city', values='temperature')