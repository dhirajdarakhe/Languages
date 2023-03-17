class Solution
{
public:
    int dtod(int x, int y, int colu) { return (x * colu) + y; }
    void f(vector<vector<string>> &ans, vector<string> &ds, int n, int r, vector<vector<pair<int, int>>> &changes_i_made)
    {
        if (r == n)
        {
            int ans1 = 0;
            for (int i = 0; i < n; ++i)
                for (int j = 0; j < n; ++j)
                    if (ds[i][j] == '*')
                        ans1++;
            if (ans1 == n)
                ans.push_back(ds);
            return;
        }

        for (int i = 0; i < n; ++i)
        {
            if (ds[r][i] == '.')
            {
                ans[r][i] = '*';
                int R = r;
                int C = i;

                R--;
                while (R >= 0)
                {
                    if (ds[R][C] == '.')
                    {
                        changes_i_made[dtod(r, i, n)].push_back({R, C});
                        ds[R][C] = '*';
                    }
                    else
                    {
                        break;
                    }
                    R--;
                }
                R = r;
                C = i;
                R++;
                while (R < n)
                {

                    if (ds[R][C] == '.')
                    {
                        changes_i_made[dtod(r, i, n)].push_back({R, C});
                        ds[R][C] = '*';
                    }
                    else
                    {
                        break;
                    }
                    R++;
                }
                R = r;
                C = i;
                C++;
                while (C < n)
                {

                    if (ds[R][C] == '.')
                    {
                        changes_i_made[dtod(r, i, n)].push_back({R, C});
                        ds[R][C] = '*';
                    }
                    else
                    {
                        break;
                    }
                    C++;
                }
                R = r;
                C = i;
                C--;
                while (C >= 0)
                {

                    if (ds[R][C] == '.')
                    {
                        changes_i_made[dtod(r, i, n)].push_back({R, C});
                        ds[R][C] = '*';
                    }
                    else
                    {
                        break;
                    }
                    C--;
                }
                R = r;
                C = i;
                f(ans, ds, n, R + 1, changes_i_made);
                for (auto x : changes_i_made[dtod(r, i, n)])
                {
                    ds[x.first][x.second] = '.';
                }
            }
        }
    }

    vector<vector<string>> solveNQueens(int n)
    {
        vector<vector<string>> ans;
        vector<string> ds;
        vector<vector<pair<int, int>>> changes_i_made(n * n, vector<pair<int, int>>());
        for (int j = 0; j < n; ++j)
        {
            string s(n, '.');
            ds.push_back(s);
        }
        f(ans, ds, n, 0, changes_i_made);
        return ans;
    }
};