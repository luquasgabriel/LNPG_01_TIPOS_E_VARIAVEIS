main :: IO ()
main = do
    putStrLn "Enter a number:"
    input <- getLine
    let number = read input :: Int

    if even number 
        then putStrLn "The number is even."
        else putStrLn "The number is odd."