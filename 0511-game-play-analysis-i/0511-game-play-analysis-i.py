import pandas as pd

def game_analysis(activity: pd.DataFrame) -> pd.DataFrame:
    activity = activity.groupby(['player_id'])['event_date'].min().reset_index()
    activity = activity.rename(columns = {'event_date': 'first_login'})
    return activity[['player_id', 'first_login']]