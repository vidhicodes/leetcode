import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    lst=[players.index.size,players.columns.size]
    return lst