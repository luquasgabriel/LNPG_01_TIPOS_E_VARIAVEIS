main :: IO ()
main = do
    putStrLn "Enter your age:"
    input <- getLine
    let age = read input :: Int

    if age >= 18
        then putStrLn "You are of legal age. (Brazil)"
        else putStrLn "You are not of legal age. (Brazil)"
