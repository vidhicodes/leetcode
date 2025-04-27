import pandas as pd

def article_views(views: pd.DataFrame) -> pd.DataFrame:
    df = views[views.author_id == views.viewer_id]
    df_unique = df['author_id'].unique()
    df_unique_sorted = sorted(df_unique)
    result_df = pd.DataFrame({'id': df_unique_sorted})
    return result_df