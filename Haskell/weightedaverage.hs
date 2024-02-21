main :: IO ()
main = do
    putStrLn "Grade 1:"
    g1 <- readLn
    putStrLn "Weight 1:"
    w1 <- readLn

    putStrLn "Grade 2:"
    g2 <- readLn
    putStrLn "Weight 2:"
    w2 <- readLn

    putStrLn "Grade 3:"
    g3 <- readLn
    putStrLn "Weight 3:"
    w3 <- readLn

    let avg = (g1 * w1 + g2 * w2 + g3 * w3) / (w1 + w2 + w3)

    putStrLn $ "Weighted Avg: " ++ show avg
